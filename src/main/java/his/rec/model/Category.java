package his.rec.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Column(unique = true)
    private Integer id;
    private String image;
    private String name;
    private Integer status=1;
    private Float price;
    @CreationTimestamp
    private Date createdAt;
    @ManyToOne
    @JoinColumn
    private User user;
    // @JsonManagedReference
    // @OneToMany(fetch = FetchType.EAGER,mappedBy = "category")
    // private List<Record> record;

    public Category() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    // public List<Record> getRecord() {
    //     return record;
    // }

    // public void setRecord(List<Record> record) {
    //     this.record = record;
    // }

    @Override
    public String toString() {
        return "Category [createdAt=" + createdAt + ", id=" + id + ", image=" + image + ", name=" + name + ", price="
                + price + ", record="  + ", status=" + status + ", user=" + user + "]";
    }

    public Category(Integer id, String image, String name, Integer status, Float price, Date createdAt, User user
         ) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.status = status;
        this.price = price;
        this.createdAt = createdAt;
        this.user = user;
        // this.record = record;
    }
   

    
}