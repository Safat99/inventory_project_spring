package com.example.inventory_project.repository;

import com.example.inventory_project.entity.Depot;
import com.example.inventory_project.projection.DepotProjectionInterface;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepotRepository extends JpaRepository<Depot,Long> {
    @Query(value = "select depotName from Depot", nativeQuery = true)
    List<DepotProjectionInterface> getAllDepotName();
}
