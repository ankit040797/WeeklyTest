package com.geekster.RestaurantTodoApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ResTodoController {

    @Autowired
    List<ResTodo> ResTodoList;

    @PostMapping("RestaurantList")
    public String addTodo(@RequestBody ResTodo myTodo){
        ResTodoList.add(myTodo);
        return "todo added";
    }

    @GetMapping("RestaurantLists")
    public List<ResTodo> getAllTodos(){
        return ResTodoList;
    }

    //add a lists of all Restrau
    @PostMapping("ListsOfRestaurant")
    public String addTodos(@RequestBody List<ResTodo> mytodos){
        ResTodoList.addAll(mytodos);
        return mytodos.size()+" todos are added";
    }
    @PutMapping("Restaurant/id/{id}/dish")
    public String updateRestaurantDishById(@PathVariable Long id, @RequestBody String dish ){
        for(ResTodo todo: ResTodoList){
            if(todo.getRestaurantId().equals(id)){
                todo.setRestaurantSpeciality(dish);
                return "Restaurant with ID" + id+ " updated with new specialty: " + dish;
            }
        }
        return "Restaurant with ID " + id + " not found";
    }

    @DeleteMapping("todos/resIds")
    public List<ResTodo> removeTodos(@RequestBody List<Integer> idList){

        for(int i=0;i<ResTodoList.size();i++){
            ResTodo ogtodo=ResTodoList.get(i);
            for(int j=0;j<idList.size();j++){

                if(ogtodo.getRestaurantId().equals(idList.get(j))){
                    ResTodoList.remove(ogtodo);
                }
            }
        }
        return ResTodoList;
    }
}
