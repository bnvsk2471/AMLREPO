package com.aml.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.aml.entity.FileData;
import com.aml.repository.FileDataRepo;
import com.aml.util.FileUtils;

@Service
public class fileDataService {

	@Autowired
	private FileDataRepo fileDataRepo;

	public String uploadImage(MultipartFile file) throws IOException {

		FileData fileData = fileDataRepo.save(FileData.builder().names(file.getOriginalFilename())
				.type(file.getContentType()).imageData(FileUtils.compressImage(file.getBytes())).build());

		if (fileData != null) {
			return "fileupload sucessfully";
		}
		return null;
	}

	public byte[] downloadImage(Integer dataId) {
		FileData fileData = fileDataRepo.findByDataId(dataId);
		byte[] files = FileUtils.decompressImage(fileData.getImageData());
		return files;
	}
}
