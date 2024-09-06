package com.ropa.renueva.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity 
@Table(name = "usuarios")
public class User {
	 @Id 
	 @GeneratedValue (strategy= GenerationType.IDENTITY)
	 @Column (name="id_usuario") //debe ser id_usuario
	 private Long id_usuario;
	 @Column (name= "nombre_usuario", length= 45, nullable= false, unique= false)
	 private String nombre_usuario; //nombreUsuario
	 @Column (name= "correo", length= 45, nullable= false, unique= false)
	 private String correo;
	 @Column (name= "telefono", length= 45, nullable= false, unique= false)
	 private String telefono;
	 @Column (name= "contraseña", length= 45, nullable= false, unique= false)
	 private String contraseña;
	 @Column (name= "contraseña2", length= 45, nullable= false, unique= false)
	 private String contraseña2;
	 
	//constructor vacío para JPA
	  public User () {
	   
	  }

	public User(Long id_usuario, String nombre_usuario, String correo, String telefono, String contraseña,
			String contraseña2) {
		super();
		this.id_usuario = id_usuario;
		this.nombre_usuario = nombre_usuario;
		this.correo = correo;
		this.telefono = telefono;
		this.contraseña = contraseña;
		this.contraseña2 = contraseña2;
	}

	public Long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNombre_usuario() {
		return nombre_usuario;
	}

	public void setNombre_usuario(String nombre_usuario) {
		this.nombre_usuario = nombre_usuario;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getContraseña2() {
		return contraseña2;
	}

	public void setContraseña2(String contraseña2) {
		this.contraseña2 = contraseña2;
	}

	@Override
	public String toString() {
		return "User [id_usuario=" + id_usuario + ", nombre_usuario=" + nombre_usuario + ", correo=" + correo
				+ ", telefono=" + telefono + ", contraseña=" + contraseña + ", contraseña2=" + contraseña2 + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(contraseña, contraseña2, correo, id_usuario, nombre_usuario, telefono);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(contraseña, other.contraseña) && Objects.equals(contraseña2, other.contraseña2)
				&& Objects.equals(correo, other.correo) && Objects.equals(id_usuario, other.id_usuario)
				&& Objects.equals(nombre_usuario, other.nombre_usuario) && Objects.equals(telefono, other.telefono);
	}


	  
}
