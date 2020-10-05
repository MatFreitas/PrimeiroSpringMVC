<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html><body>
	<h3>Adicionar tarefas</h3>
	<form action="adicionaTarefa" method="post">
	Descrição: <br />
	<textarea name="descricao" rows="6" cols="80"></textarea><br>
	<input type="submit" value="Adicionar">
	</form>
	<br />
	
	<h3>Remover tarefa</h3>
	<form action="removeTarefa" method="post">
	Qual tarefa deseja remover (inserir núm. de id)?: <br />
	<textarea name="id" rows="1" cols="1"></textarea><br>
	<input type="submit" value="Remover">
	</form>
</body></html>