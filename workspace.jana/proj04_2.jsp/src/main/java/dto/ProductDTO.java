package dto;

public class ProductDTO {
    private int productId;
    private String productName;
    private int productPrice;
    private String productDescription;

    // 기본 생성자 (필수)
    public ProductDTO() {}

    // 모든 필드를 포함한 생성자 (Action 페이지에서 new ProductDTO(...) 할 때 사용)
    public ProductDTO(int productId, String productName, int productPrice, String productDescription) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productDescription = productDescription;
    }

    // Getter / Setter
    public int getProductId() { return productId; }
    public void setProductId(int productId) { this.productId = productId; }
    public String getProductName() { return productName; }
    public void setProductName(String productName) { this.productName = productName; }
    public int getProductPrice() { return productPrice; }
    public void setProductPrice(int productPrice) { this.productPrice = productPrice; }
    public String getProductDescription() { return productDescription; }
    public void setProductDescription(String productDescription) { this.productDescription = productDescription; }
}