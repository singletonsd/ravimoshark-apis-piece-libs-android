/*
 * Ravimoshark Piece API
 * This is an API to interact with Ravimoshark piece database. # Introduction This API allow to create, modify and delete pieces and products (cards, details and key points). # User Authentication This API does not contain any kind of user validation but It request to have a valid authentication user to interact with it. For more information about user Authentication, please refer to [Ravimoshark User Authentication](https://ravimoshark.com/back/apis/auth/latest). 
 *
 * OpenAPI spec version: 1.0.0
 * Contact: dev@ravimoshark.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.ravimoshark.apis.piece.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.ravimoshark.apis.piece.model.Pieces;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.Date;
import java.io.Serializable;
/**
 * Pieces detail information.
 */
@Schema(description = "Pieces detail information.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-11-25T15:45:54.964081+11:00[Australia/Sydney]")
public class PieceDetails implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("id")
  private Long id = null;

  @SerializedName("piece")
  private Pieces piece = null;

  @SerializedName("refArticle")
  private String refArticle = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("content")
  private String content = null;

  @SerializedName("unit")
  private String unit = null;

  @SerializedName("line")
  private Long line = null;

  @SerializedName("createdAt")
  private Date createdAt = null;

  @SerializedName("updatedAt")
  private Date updatedAt = null;

  @SerializedName("deleted")
  private Boolean deleted = null;

  public PieceDetails id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public PieceDetails piece(Pieces piece) {
    this.piece = piece;
    return this;
  }

   /**
   * Get piece
   * @return piece
  **/
  @Schema(description = "")
  public Pieces getPiece() {
    return piece;
  }

  public void setPiece(Pieces piece) {
    this.piece = piece;
  }

  public PieceDetails refArticle(String refArticle) {
    this.refArticle = refArticle;
    return this;
  }

   /**
   * Get refArticle
   * @return refArticle
  **/
  @Schema(description = "")
  public String getRefArticle() {
    return refArticle;
  }

  public void setRefArticle(String refArticle) {
    this.refArticle = refArticle;
  }

  public PieceDetails title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Get title
   * @return title
  **/
  @Schema(description = "")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PieceDetails content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @Schema(description = "")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public PieceDetails unit(String unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Get unit
   * @return unit
  **/
  @Schema(description = "")
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public PieceDetails line(Long line) {
    this.line = line;
    return this;
  }

   /**
   * Get line
   * @return line
  **/
  @Schema(description = "")
  public Long getLine() {
    return line;
  }

  public void setLine(Long line) {
    this.line = line;
  }

  public PieceDetails createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public PieceDetails updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @Schema(description = "")
  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public PieceDetails deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

   /**
   * Get deleted
   * @return deleted
  **/
  @Schema(description = "")
  public Boolean isDeleted() {
    return deleted;
  }

  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PieceDetails pieceDetails = (PieceDetails) o;
    return Objects.equals(this.id, pieceDetails.id) &&
        Objects.equals(this.piece, pieceDetails.piece) &&
        Objects.equals(this.refArticle, pieceDetails.refArticle) &&
        Objects.equals(this.title, pieceDetails.title) &&
        Objects.equals(this.content, pieceDetails.content) &&
        Objects.equals(this.unit, pieceDetails.unit) &&
        Objects.equals(this.line, pieceDetails.line) &&
        Objects.equals(this.createdAt, pieceDetails.createdAt) &&
        Objects.equals(this.updatedAt, pieceDetails.updatedAt) &&
        Objects.equals(this.deleted, pieceDetails.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, piece, refArticle, title, content, unit, line, createdAt, updatedAt, deleted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PieceDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    piece: ").append(toIndentedString(piece)).append("\n");
    sb.append("    refArticle: ").append(toIndentedString(refArticle)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    line: ").append(toIndentedString(line)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
