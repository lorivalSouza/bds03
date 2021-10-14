package com.devsuperior.bds03.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.devsuperior.bds03.entities.Department;

public class DepartmentDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public Long id;
	
	@Size(min = 5, max = 100, message = "Campo nome deve ter entre 5 e 100 caracteres")
	@NotBlank(message = "Campo obrigatório.")
	public String name;
	
	public DepartmentDTO() {
	}

	public DepartmentDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public DepartmentDTO(Department entity) {
		id = entity.getId();
		name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
