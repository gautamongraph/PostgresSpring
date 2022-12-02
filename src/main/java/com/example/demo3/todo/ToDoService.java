package com.example.demo3.todo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToDoService {
	
    @Autowired
	private ToDoRepository toDoRepository;
	
	public List<ToDo> getAllToDos(){
		
		List<ToDo> todos = new ArrayList<>();
		toDoRepository.findAll().forEach(todos::add);
		return todos;
	}
	
	public Optional<ToDo> getToDo(Integer Id) {
		return toDoRepository.findById(Id);
		
	}
	
	public void createToDo(ToDo todo) {
		toDoRepository.save(todo);
	}
	
	public void updateToDo(Integer Id,ToDo todo) {
		
		toDoRepository.save(todo);
	}
	
	public void deleteToDo(Integer Id) {
		toDoRepository.deleteById(Id);
	}
	
	

}
