package com.maira.comit.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.maira.comit.entidades.Foto;
import com.maira.comit.repositorios.FotoRepository;




@Controller
@RequestMapping("/Foto")
public class FotoController {
	@Autowired
	private FotoRepository fotoRepository;
	
	//crea una foto
	@RequestMapping("/sitio")
	public String crear(Model model) {
	     Foto foto = new Foto();
		foto.setFoto(new String());
		model.addAttribute("foto", foto);

		return "sitio";
	}
		//guarda una foto
		@RequestMapping(value = "/guardarFoto", method = { RequestMethod.POST, RequestMethod.PUT })
		public String guardarFoto(@RequestParam("foto") MultipartFile file,Model model) throws ParseException {

			
		    Foto foto = new Foto();
			String fileName = StringUtils.cleanPath(file.getOriginalFilename());
			if(fileName.contains(".."))
			{
				System.out.println("no es una imagen valida");
			}
			try {
				foto.setFoto(Base64.getEncoder().encodeToString(file.getBytes()));
			} catch (IOException e) {
				e.printStackTrace();
			}
	        
	        fotoRepository.save(foto);
	        return "guardar";
			}
		
		
		
		

}

