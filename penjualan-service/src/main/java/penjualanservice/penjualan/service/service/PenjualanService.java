/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualanservice.penjualan.service.service;

import penjualanservice.penjualan.service.vo.ResponseTemplateVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import penjualanservice.penjualan.service.entity.Penjualan;
import penjualanservice.penjualan.service.repository.PenjualanRepository;
import penjualanservice.penjualan.service.vo.Pelanggan;

/**
 *
 * @author Apip
 */
@Service
public class PenjualanService {

    @Autowired
    private PenjualanRepository penjualanRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Penjualan savePenjualan(Penjualan penjualan) {
        return penjualanRepository.save(penjualan);
    }

    public ResponseTemplateVO getPenjualan(Long penjualanId) {
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Penjualan penjualan = penjualanRepository.findByPenjualanId(penjualanId);
//        Pelanggan pelanggan = restTemplate.getForObject("http://localhost:8888/pelangggan/" 
//              + penjualan.getPelangganId(), Pelanggan.class);
//        vo.setPelanggan(pelanggan);
        Pelanggan pelanggan = restTemplate.getForObject("http://localhost:8888/pelanggan/"
                + penjualan.getPelangganId(), Pelanggan.class);
        vo.setPenjualan(penjualan);
        vo.setPelanggan(pelanggan);
        return vo;
    }
}
