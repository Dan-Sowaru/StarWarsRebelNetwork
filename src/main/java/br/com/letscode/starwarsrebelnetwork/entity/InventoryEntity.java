package br.com.letscode.starwarsrebelnetwork.entity;

import lombok.*;

import java.util.List;


@Getter
@Setter
public class InventoryEntity {

   private List<InventoryItemEntity> itensEntity;

   public List<InventoryItemEntity> getAll() {
      return itensEntity;
   }

}