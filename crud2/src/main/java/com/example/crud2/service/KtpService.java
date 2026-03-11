package com.example.crud2.service;

import com.example.crud2.model.dto.KtpAddRequest;
import com.example.crud2.model.dto.KtpDto;
import java.util.List;

public interface KtpService {
    KtpDto addKtp(KtpAddRequest request);
    List<KtpDto> getAllKtp();
    KtpDto getKtpById(Integer id);
    KtpDto updateKtp(Integer id, KtpAddRequest request);
    void deleteKtp(Integer id);
}
