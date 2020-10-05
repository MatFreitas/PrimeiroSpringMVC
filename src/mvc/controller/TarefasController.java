package mvc.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import mvc.model.Tarefa;
import mvc.model.TarefasDAO;

@Controller
public class TarefasController {
	
	 @RequestMapping("/")
	 public String execute() {
		 System.out.println("Logica do MVC");
		 return "info";
	 }
	 
	 @RequestMapping("criaTarefa")
	 public String form() {
		 return "formTarefa";
	 }
	 
	 @RequestMapping("adicionaTarefa")
	 public String adiciona(Tarefa tarefa) {
		 TarefasDAO dao = new TarefasDAO();
		 dao.adicionaDescricao(tarefa);
		 return "adicionada";
	 }
	 
	 @RequestMapping("removeTarefa")
	 public String lista(Tarefa tarefa) {
		 TarefasDAO dao = new TarefasDAO();
		 dao.remove(tarefa);
		 return "removida";
	 }
}
