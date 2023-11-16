import java.util.ArrayList;
import java.util.Scanner;

import models.Produto;

public class Main {
    private static ArrayList<Produto> produtos = new ArrayList<>();
    private static int idCounter = 1;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcao;
        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    editarProduto();
                    break;
                case 3:
                    deletarProduto();
                    break;
                case 4:
                    listarProdutos();
                    break;
                case 0:
                    System.out.println("Saindo do sistema. Adeus!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);
    }

    // #region Menu
    public static void exibirMenu() {
        System.out.println("Menu:");
        System.out.println("0 - Sair do sistema");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Editar produto");
        System.out.println("3 - Deletar produto");
        System.out.println("4 - Visualizar lista de produtos");
        System.out.print("Escolha uma opção: ");
    }
    // #endregion

    // #region Cadastrar Produto
    public static void cadastrarProduto() {
        System.out.println("Nome do produto: ");
        String nome = scanner.nextLine();
        System.out.println("Quantidade: ");
        int quantidade = scanner.nextInt();
        System.out.println("Valor: ");
        double valor = scanner.nextDouble();
        scanner.nextLine();

        Produto produto = new Produto(idCounter, nome, quantidade, valor);
        produtos.add(produto);
        idCounter++;
        System.out.println("Produto cadastrado com sucesso.");
    }
    // #endregion

    // #region Encontrando produtos pelo id
    private static Produto encontrarProduto(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }
    // #endregion

    // #region Editar Produto
    public static void editarProduto() {
        System.out.println("Digite o id od produto que deseja editar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Produto editandoProduto = encontrarProduto(id);

        if (editandoProduto != null) {
            System.out.println("Nome: ");
            String novoNome = scanner.nextLine();
            System.out.print("Quantidade: ");
            int novaQuantidade = scanner.nextInt();
            System.out.print("Valor: ");
            double novoValor = scanner.nextDouble();

            editandoProduto.setNome(novoNome);
            editandoProduto.setQuantidade(novaQuantidade);
            editandoProduto.setValor(novoValor);

            System.out.println("Produto editado com sucesso.");
        } else {
            System.out.println("Produto nao encontrado.");
        }

    }
    // #endregion

    // #region Deletar produtos
    public static void deletarProduto() {
        System.out.println("Digite o id do produto que deseja deletar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Produto deletandoProduto = encontrarProduto(id);

        if (deletandoProduto != null) {
            produtos.remove(deletandoProduto);
            System.out.println("Produto deletado com sucesso.");
        } else {
            System.out.println("Produto não encontrado.");
        }
    }

    // #endregion
    private static void listarProdutos() {
        System.out.println("Lista de Produtos:");
        for (Produto produto : produtos) {
            System.out.println("ID: " + produto.getId());
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Quantidade: " + produto.getQuantidade());
            System.out.println("Valor: " + produto.getValor());
            System.out.println();

            // #region Listar produtos
        }
    }
}