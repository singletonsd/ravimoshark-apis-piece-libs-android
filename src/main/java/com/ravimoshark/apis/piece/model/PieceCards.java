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
import com.ravimoshark.apis.piece.model.PieceCategories;
import com.ravimoshark.apis.piece.model.Pieces;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.Date;
import java.io.Serializable;
/**
 * Pieces card information.
 */
@Schema(description = "Pieces card information.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-11-25T15:45:54.964081+11:00[Australia/Sydney]")
public class PieceCards implements Serializable{
  private static final long serialVersionUID = 1L;
  @SerializedName("id")
  private Long id = null;

  @SerializedName("piece")
  private Pieces piece = null;

  @SerializedName("refArticle")
  private String refArticle = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("categoryId")
  private String categoryId = null;

  @SerializedName("category")
  private PieceCategories category = null;

  @SerializedName("imageName")
  private String imageName = null;

  @SerializedName("createdAt")
  private Date createdAt = null;

  @SerializedName("updatedAt")
  private Date updatedAt = null;

  @SerializedName("deleted")
  private Boolean deleted = null;

  public PieceCards id(Long id) {
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

  public PieceCards piece(Pieces piece) {
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

  public PieceCards refArticle(String refArticle) {
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

  public PieceCards description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PieceCards categoryId(String categoryId) {
    this.categoryId = categoryId;
    return this;
  }

   /**
   * Get categoryId
   * @return categoryId
  **/
  @Schema(description = "")
  public String getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }

  public PieceCards category(PieceCategories category) {
    this.category = category;
    return this;
  }

   /**
   * Get category
   * @return category
  **/
  @Schema(description = "")
  public PieceCategories getCategory() {
    return category;
  }

  public void setCategory(PieceCategories category) {
    this.category = category;
  }

  public PieceCards imageName(String imageName) {
    this.imageName = imageName;
    return this;
  }

   /**
   * Get imageName
   * @return imageName
  **/
  @Schema(description = "")
  public String getImageName() {
    return imageName;
  }

  public void setImageName(String imageName) {
    this.imageName = imageName;
  }

  public PieceCards createdAt(Date createdAt) {
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

  public PieceCards updatedAt(Date updatedAt) {
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

  public PieceCards deleted(Boolean deleted) {
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
    PieceCards pieceCards = (PieceCards) o;
    return Objects.equals(this.id, pieceCards.id) &&
        Objects.equals(this.piece, pieceCards.piece) &&
        Objects.equals(this.refArticle, pieceCards.refArticle) &&
        Objects.equals(this.description, pieceCards.description) &&
        Objects.equals(this.categoryId, pieceCards.categoryId) &&
        Objects.equals(this.category, pieceCards.category) &&
        Objects.equals(this.imageName, pieceCards.imageName) &&
        Objects.equals(this.createdAt, pieceCards.createdAt) &&
        Objects.equals(this.updatedAt, pieceCards.updatedAt) &&
        Objects.equals(this.deleted, pieceCards.deleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, piece, refArticle, description, categoryId, category, imageName, createdAt, updatedAt, deleted);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PieceCards {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    piece: ").append(toIndentedString(piece)).append("\n");
    sb.append("    refArticle: ").append(toIndentedString(refArticle)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    imageName: ").append(toIndentedString(imageName)).append("\n");
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
