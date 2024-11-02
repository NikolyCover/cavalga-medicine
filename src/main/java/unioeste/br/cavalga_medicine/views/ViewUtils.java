package unioeste.br.cavalga_medicine.views;

import de.vandermeer.asciitable.AsciiTable;

import java.io.Console;
import java.util.List;
import java.util.function.Function;

public class ViewUtils {
    private final Console console = System.console();

    public String input(String label){
        System.out.print(label);

        return console.readLine();
    }

    public <T> T input(String label, Function<String, T> parser){
        String input = input(label);

        try{
            return parser.apply(input);
        }
        catch (NumberFormatException e){
            System.out.println("Formato inválido. Por favor, tente novamente.");

            return input(label, parser);
        }
    }

    protected void showMenu(String... options){
        AsciiTable menu = new AsciiTable();
        menu.getContext().setWidth(150);

        menu.addRule();

        for(String option : options){
            menu.addRow(option);
            menu.addRule();
        }

        System.out.println(menu.render());
    }

    protected <T> void showTable(List<String> headers, List<T> data, Function<T, List<String>> rowRenderer) {
        AsciiTable table = new AsciiTable();

        table.addRule();
        table.addRow(headers.toArray());
        table.addRule();
        table.getContext().setWidth(150);

        for (T item : data) {
            List<String> row = (List<String>) rowRenderer.apply(item);

            table.addRow(row.toArray());
            table.addRule();
        }

        System.out.println(table.render());
    }

    public void showMessage(String message){
        System.out.println(message);
    }

    public void showError(Exception exception){
        System.out.println(exception.getMessage());
    }
}
