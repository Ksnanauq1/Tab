package src;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import src.models.Teams;

public class Main extends Application {
	
public static void main(String[] agrs) {
	launch(agrs);	
}

Stage window;
TableView<Teams> table;

@Override 
public void start(Stage primaryStage) throws Exception {
	window=primaryStage;
	window.setTitle("Tabela ligi pi³karskiej");
	
	// Tworzenie tabeli
	table = new TableView<>();
	
	TableColumn<Teams, String> colPosition = new TableColumn<>("Pozycja");
	colPosition.setCellValueFactory(new PropertyValueFactory<Teams, String>("position"));
	
	TableColumn<Teams, String> colTeam = new TableColumn<>("Nazwa");
	colTeam.setCellValueFactory(new PropertyValueFactory<Teams, String>("team"));
	
	TableColumn<Teams, String> colMatches = new TableColumn<>("Mecze");
	colMatches.setCellValueFactory(new PropertyValueFactory<Teams, String>("matches"));
	
	TableColumn<Teams, String> colPoints = new TableColumn<>("Punkty");
	colPoints.setCellValueFactory(new PropertyValueFactory<Teams, String>("points"));
	
	TableColumn<Teams, String> colGoals = new TableColumn<>("Bramki");
	colGoals.setCellValueFactory(new PropertyValueFactory<Teams, String>("goals"));
	
	table.getColumns().addAll(
			colPosition, colTeam, colMatches, colPoints, colGoals
			);
	
	table.setItems( getTeams() );
	
	VBox layout = new VBox(10);
	layout.getChildren().addAll(table);
	
	Scene scene = new Scene(layout, 500,500);
	window.setScene(scene);
	window.show();
}

public ObservableList<Teams> getTeams() {
	ObservableList<Teams> teams = FXCollections.observableArrayList(
			new Teams("1", "Piast Gliwice", "20", "42", "37–25"),
			new Teams("2", "Legia Warszawa", "20", "37", "39–20"),
			new Teams("3", "Cracovia", "21", "36", "44–29"),
			new Teams("4", "Pogoñ Szczecin", "21", "36", "26–20"),
			new Teams("5", "Ruch Chorzów", "21", "31", "27–31"),
			new Teams("6", "Lech Poznañ", "20", "28", "23–23"),
			new Teams("7", "Zag³êbie Lubin", "21", "27", "27–31"),
			new Teams("8", "Jagiellonia Bia³ystok", "21", "25", "30–34"),
			new Teams("9", "Górnik £êczna", "21", "25", "25–32"),
			new Teams("10", "Lechia Gdañsk", "21", "24", "25–27"),
			new Teams("11", "Korona Kielce", "20", "24", "15–20"),
			new Teams("12", "Termalica Bruk-Bet Nieciecza", "21", "24", "21–27"),
			new Teams("13", "Wis³a Kraków", "21", "23", "28–23"),
			new Teams("14", "Górnik Zabrze", "21", "21", "29–32"),
			new Teams("15", "Podbeskidzie Bielsko-Bia³a", "20", "21", "21–34"),
			new Teams("16", "Œl¹sk Wroc³aw", "20", "19", "20–29")
			);
	
	return teams;
}
}