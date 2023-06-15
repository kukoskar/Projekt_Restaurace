package com.engeto.attributes;

public enum Category {

   SOUP("soup"), FOOD("food"), DRINK("drink");

   private String description;
   Category(String description){
       this.description = description;
   }

   public String getDescription() {
       return description;
   }
}
