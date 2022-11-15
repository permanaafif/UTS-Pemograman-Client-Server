/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualanservice.penjualan.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import penjualanservice.penjualan.service.entity.Penjualan;

/**
 *
 * @author Apip
 */
@Repository
public interface PenjualanRepository extends JpaRepository<Penjualan, Long>{
    public Penjualan findByPenjualanId(Long penjualanId);
    
}
