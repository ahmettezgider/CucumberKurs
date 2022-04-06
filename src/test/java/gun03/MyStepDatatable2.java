package gun03;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class MyStepDatatable2 {

    @Given("map birinci yontem")
    public void mapBirinciYontem(DataTable table) {
        Map<String, String> map = table.asMap(String.class, String.class);
        System.out.println(table);
        System.out.println(map);

        System.out.println(map.get("name"));
    }

    @When("map ikinci yontem list of maps")
    public void mapIkinciYontemListOfMaps(DataTable table) {
        List<Map<String, String>> maps = table.asMaps();
        System.out.println(maps);
        System.out.println("---------------");

        for (Map<String, String> map : maps) {
            System.out.println(map.get("name") + ", " + map.get("surname") + ", " + map.get("age"));
        }
    }

    @When("login map ikinci yontem list of maps")
    public void loginMapIkinciYontemListOfMaps(DataTable table) {
        List<Map<String, String>> maps = table.asMaps();
        for (Map<String, String> map : maps) {
            String username = map.get("email");
            String password = map.get("password");
            int status = Integer.parseInt(map.get("status"));

            //......
        }
    }
}
