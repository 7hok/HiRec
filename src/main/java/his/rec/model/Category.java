package his.rec.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Category {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(unique = true)
    private Integer id;
    private String image;
    private String name;
    private Integer status;
    private Float price;
    private Date createdAt;
    @ManyToOne
    @JoinColumn
    private User user;

    public Category() {
    }
    public Category(String image,String name,Integer status,Float price,Date createdAt,User user) {
        this.image=image;
        this.name=name;
        this.status=status;
        this.price=price;
        this.createdAt=createdAt;
        this.user=user;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImage() {
        return this.image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Float getPrice() {
        return this.price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    
}