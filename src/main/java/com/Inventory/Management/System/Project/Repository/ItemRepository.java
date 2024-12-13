package com.Inventory.Management.System.Project.Repository;


import com.Inventory.Management.System.Project.Model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
