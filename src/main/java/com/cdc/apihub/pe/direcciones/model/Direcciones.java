package com.cdc.apihub.pe.direcciones.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;


public class Direcciones {
  @SerializedName("fecReporte")
  private String fecReporte = null;
  @SerializedName("idFuente")
  private String idFuente = null;
  @SerializedName("fuente")
  private String fuente = null;
  @SerializedName("direccion")
  private String direccion = null;
  @SerializedName("dpto")
  private String dpto = null;
  @SerializedName("prov")
  private String prov = null;
  @SerializedName("distrito")
  private String distrito = null;
  public Direcciones fecReporte(String fecReporte) {
    this.fecReporte = fecReporte;
    return this;
  }
   
  @ApiModelProperty(value = "Es la fecha en la que fue reportada la dirección. Formato: yyyymmdd")
  public String getFecReporte() {
    return fecReporte;
  }
  public void setFecReporte(String fecReporte) {
    this.fecReporte = fecReporte;
  }
  public Direcciones idFuente(String idFuente) {
    this.idFuente = idFuente;
    return this;
  }
   
  @ApiModelProperty(value = "Identificador de la fuente de la cual proviene la dirección.<table><thead><tr><th>Id Fuente<br></th><th>Fuente</th></tr></thead><tbody><tr><td>20000<br></td><td>APORTANTES PRIVADOS</td></tr><tr><td>8</td><td>CCL</td></tr><tr><td>11</td><td>SUNAT</td></tr><tr><td>10000</td><td>INST MICROFINANCIERAS</td></tr><tr><td>30000</td><td>SBS</td></tr><tr><td>40000<br></td><td>ADUANAS</td></tr><tr><td>37</td><td>SEDAPAL</td></tr></tbody></table>")
  public String getIdFuente() {
    return idFuente;
  }
  public void setIdFuente(String idFuente) {
    this.idFuente = idFuente;
  }
  public Direcciones fuente(String fuente) {
    this.fuente = fuente;
    return this;
  }
   
  @ApiModelProperty(value = "Nombre de la fuente de la cual proviene la dirección.")
  public String getFuente() {
    return fuente;
  }
  public void setFuente(String fuente) {
    this.fuente = fuente;
  }
  public Direcciones direccion(String direccion) {
    this.direccion = direccion;
    return this;
  }
   
  @ApiModelProperty(value = "Dirección encontrada.")
  public String getDireccion() {
    return direccion;
  }
  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }
  public Direcciones dpto(String dpto) {
    this.dpto = dpto;
    return this;
  }
   
  @ApiModelProperty(value = "Nombre del Departamento al que pertenece la dirección.")
  public String getDpto() {
    return dpto;
  }
  public void setDpto(String dpto) {
    this.dpto = dpto;
  }
  public Direcciones prov(String prov) {
    this.prov = prov;
    return this;
  }
   
  @ApiModelProperty(value = "Provincia a la que pertenece la dirección.")
  public String getProv() {
    return prov;
  }
  public void setProv(String prov) {
    this.prov = prov;
  }
  public Direcciones distrito(String distrito) {
    this.distrito = distrito;
    return this;
  }
   
  @ApiModelProperty(value = "distrito donde se encuentra la dirección")
  public String getDistrito() {
    return distrito;
  }
  public void setDistrito(String distrito) {
    this.distrito = distrito;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Direcciones direcciones = (Direcciones) o;
    return Objects.equals(this.fecReporte, direcciones.fecReporte) &&
        Objects.equals(this.idFuente, direcciones.idFuente) &&
        Objects.equals(this.fuente, direcciones.fuente) &&
        Objects.equals(this.direccion, direcciones.direccion) &&
        Objects.equals(this.dpto, direcciones.dpto) &&
        Objects.equals(this.prov, direcciones.prov) &&
        Objects.equals(this.distrito, direcciones.distrito);
  }
  @Override
  public int hashCode() {
    return Objects.hash(fecReporte, idFuente, fuente, direccion, dpto, prov, distrito);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Direcciones {\n");
    
    sb.append("    fecReporte: ").append(toIndentedString(fecReporte)).append("\n");
    sb.append("    idFuente: ").append(toIndentedString(idFuente)).append("\n");
    sb.append("    fuente: ").append(toIndentedString(fuente)).append("\n");
    sb.append("    direccion: ").append(toIndentedString(direccion)).append("\n");
    sb.append("    dpto: ").append(toIndentedString(dpto)).append("\n");
    sb.append("    prov: ").append(toIndentedString(prov)).append("\n");
    sb.append("    distrito: ").append(toIndentedString(distrito)).append("\n");
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
