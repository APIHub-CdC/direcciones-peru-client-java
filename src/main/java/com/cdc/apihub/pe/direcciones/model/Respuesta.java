package com.cdc.apihub.pe.direcciones.model;

import java.util.Objects;

import com.cdc.apihub.pe.direcciones.model.Direcciones;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Respuesta {
  @SerializedName("fechaConsulta")
  private String fechaConsulta = null;
  @SerializedName("numConsulta")
  private BigDecimal numConsulta = null;
  @SerializedName("codigoSbs")
  private String codigoSbs = null;
  @SerializedName("numeroDocumento")
  private String numeroDocumento = null;
  @SerializedName("tipoDocumento")
  private String tipoDocumento = null;
  @SerializedName("ruc")
  private String ruc = null;
  @SerializedName("primerNombre")
  private String primerNombre = null;
  @SerializedName("segundoNombre")
  private String segundoNombre = null;
  @SerializedName("apellidoPaterno")
  private String apellidoPaterno = null;
  @SerializedName("apellidoMaterno")
  private String apellidoMaterno = null;
  @SerializedName("direcciones")
  private List<Direcciones> direcciones = null;
  public Respuesta fechaConsulta(String fechaConsulta) {
    this.fechaConsulta = fechaConsulta;
    return this;
  }
   
  @ApiModelProperty(example = "2020-12-03T17:52:40.735", value = "Fecha  y hora en la que se realiza la consulta. Formato: yyyy-mm-ddThh:mm:ss.sss")
  public String getFechaConsulta() {
    return fechaConsulta;
  }
  public void setFechaConsulta(String fechaConsulta) {
    this.fechaConsulta = fechaConsulta;
  }
  public Respuesta numConsulta(BigDecimal numConsulta) {
    this.numConsulta = numConsulta;
    return this;
  }
   
  @ApiModelProperty(example = "1574898.0", value = "Número de consulta de Círculo de Crédito.")
  public BigDecimal getNumConsulta() {
    return numConsulta;
  }
  public void setNumConsulta(BigDecimal numConsulta) {
    this.numConsulta = numConsulta;
  }
  public Respuesta codigoSbs(String codigoSbs) {
    this.codigoSbs = codigoSbs;
    return this;
  }
   
  @ApiModelProperty(example = "99999999", value = "Número Identificador de la persona encontrada en la superintendencia de banca y seguros (SBS).")
  public String getCodigoSbs() {
    return codigoSbs;
  }
  public void setCodigoSbs(String codigoSbs) {
    this.codigoSbs = codigoSbs;
  }
  public Respuesta numeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
    return this;
  }
   
  @ApiModelProperty(example = "88888888", value = "Número de Documento de Identidad de la persona encontrada.")
  public String getNumeroDocumento() {
    return numeroDocumento;
  }
  public void setNumeroDocumento(String numeroDocumento) {
    this.numeroDocumento = numeroDocumento;
  }
  public Respuesta tipoDocumento(String tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
    return this;
  }
   
  @ApiModelProperty(example = "1", value = "<table><thead><tr>Tipo de documento que corresponde al número de documento que se quiere consultar</tr><tr><th>Tipo documento</th><th>Descripción</th></tr></thead><tbody><tr><td>1</td><td>DNI</td></tr><tr><td>2</td><td>Carnet de extranjería</td></tr><tr><td>10</td><td>RUC</td></tr></tbody></table>")
  public String getTipoDocumento() {
    return tipoDocumento;
  }
  public void setTipoDocumento(String tipoDocumento) {
    this.tipoDocumento = tipoDocumento;
  }
  public Respuesta ruc(String ruc) {
    this.ruc = ruc;
    return this;
  }
   
  @ApiModelProperty(example = "1088888888", value = "Número de RUC de la persona encontrada.")
  public String getRuc() {
    return ruc;
  }
  public void setRuc(String ruc) {
    this.ruc = ruc;
  }
  public Respuesta primerNombre(String primerNombre) {
    this.primerNombre = primerNombre;
    return this;
  }
   
  @ApiModelProperty(example = "NOMBRE", value = "Primer nombre de la persona que realiza la consulta.")
  public String getPrimerNombre() {
    return primerNombre;
  }
  public void setPrimerNombre(String primerNombre) {
    this.primerNombre = primerNombre;
  }
  public Respuesta segundoNombre(String segundoNombre) {
    this.segundoNombre = segundoNombre;
    return this;
  }
   
  @ApiModelProperty(example = "SEGUNDO NOMBRE", value = "Segundo nombre de la persona que realiza la consulta.")
  public String getSegundoNombre() {
    return segundoNombre;
  }
  public void setSegundoNombre(String segundoNombre) {
    this.segundoNombre = segundoNombre;
  }
  public Respuesta apellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
    return this;
  }
   
  @ApiModelProperty(example = "AP PATERNO", value = "Apellido paterno de la persona que realiza la consulta.")
  public String getApellidoPaterno() {
    return apellidoPaterno;
  }
  public void setApellidoPaterno(String apellidoPaterno) {
    this.apellidoPaterno = apellidoPaterno;
  }
  public Respuesta apellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
    return this;
  }
   
  @ApiModelProperty(example = "AP MATERNO", value = "Apellido materno de la persona que realiza la consulta.")
  public String getApellidoMaterno() {
    return apellidoMaterno;
  }
  public void setApellidoMaterno(String apellidoMaterno) {
    this.apellidoMaterno = apellidoMaterno;
  }
  public Respuesta direcciones(List<Direcciones> direcciones) {
    this.direcciones = direcciones;
    return this;
  }
  public Respuesta addDireccionesItem(Direcciones direccionesItem) {
    if (this.direcciones == null) {
      this.direcciones = new ArrayList<Direcciones>();
    }
    this.direcciones.add(direccionesItem);
    return this;
  }
   
  @ApiModelProperty(example = "[{\"fecReporte\":\"20120321\",\"idFuente\":\"11\",\"fuente\":\"Sunat\",\"direccion\":\"CALLE MONTE CARMELO 106 DP 101 CHACARILLA\",\"dpto\":\"LIMA\",\"prov\":\"LIMA\",\"distrito\":\"SANTIAGO DE SURCO\"},{\"fecReporte\":\"20161231\",\"idFuente\":\"20000\",\"fuente\":\"APORTANTES PRIVADOS\",\"direccion\":\"CA SIN NOMBRE SN MZ B LT 20 URB LOS CED\",\"dpto\":\"LAMBAYEQUE\",\"distrito\":\"CHICLAYO\"},{\"fecReporte\":\"20161226\",\"idFuente\":\"20000\",\"fuente\":\"APORTANTES PRIVADOS\",\"direccion\":\"URB LOS CEDROS MZ B LT 20\",\"dpto\":\"LAMBAYEQUE\",\"distrito\":\"CHICLAYO\"},{\"fecReporte\":\"20111102\",\"idFuente\":\"8\",\"fuente\":\"CCL\",\"direccion\":\"AV HUMBOLT 1127 ATUSPARIAS JOSE LEONARDO ORTIZ\"}]", value = "Direcciones relacionadas con la persona buscada.")
  public List<Direcciones> getDirecciones() {
    return direcciones;
  }
  public void setDirecciones(List<Direcciones> direcciones) {
    this.direcciones = direcciones;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Respuesta respuesta = (Respuesta) o;
    return Objects.equals(this.fechaConsulta, respuesta.fechaConsulta) &&
        Objects.equals(this.numConsulta, respuesta.numConsulta) &&
        Objects.equals(this.codigoSbs, respuesta.codigoSbs) &&
        Objects.equals(this.numeroDocumento, respuesta.numeroDocumento) &&
        Objects.equals(this.tipoDocumento, respuesta.tipoDocumento) &&
        Objects.equals(this.ruc, respuesta.ruc) &&
        Objects.equals(this.primerNombre, respuesta.primerNombre) &&
        Objects.equals(this.segundoNombre, respuesta.segundoNombre) &&
        Objects.equals(this.apellidoPaterno, respuesta.apellidoPaterno) &&
        Objects.equals(this.apellidoMaterno, respuesta.apellidoMaterno) &&
        Objects.equals(this.direcciones, respuesta.direcciones);
  }
  @Override
  public int hashCode() {
    return Objects.hash(fechaConsulta, numConsulta, codigoSbs, numeroDocumento, tipoDocumento, ruc, primerNombre, segundoNombre, apellidoPaterno, apellidoMaterno, direcciones);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Respuesta {\n");
    
    sb.append("    fechaConsulta: ").append(toIndentedString(fechaConsulta)).append("\n");
    sb.append("    numConsulta: ").append(toIndentedString(numConsulta)).append("\n");
    sb.append("    codigoSbs: ").append(toIndentedString(codigoSbs)).append("\n");
    sb.append("    numeroDocumento: ").append(toIndentedString(numeroDocumento)).append("\n");
    sb.append("    tipoDocumento: ").append(toIndentedString(tipoDocumento)).append("\n");
    sb.append("    ruc: ").append(toIndentedString(ruc)).append("\n");
    sb.append("    primerNombre: ").append(toIndentedString(primerNombre)).append("\n");
    sb.append("    segundoNombre: ").append(toIndentedString(segundoNombre)).append("\n");
    sb.append("    apellidoPaterno: ").append(toIndentedString(apellidoPaterno)).append("\n");
    sb.append("    apellidoMaterno: ").append(toIndentedString(apellidoMaterno)).append("\n");
    sb.append("    direcciones: ").append(toIndentedString(direcciones)).append("\n");
    sb.append("}");
    return sb.toString();
  }
  
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
