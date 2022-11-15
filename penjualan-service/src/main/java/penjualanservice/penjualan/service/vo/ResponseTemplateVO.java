/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualanservice.penjualan.service.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import penjualanservice.penjualan.service.entity.Penjualan;

/**
 *
 * @author Apip
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateVO {
    private Penjualan penjualan;
      private Pelanggan pelanggan;
}
