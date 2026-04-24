package dto;

public class MemberDTO {
    // 1. 멤버 변수 (사용자님이 DB에 만든 컬럼과 매칭)
    private String id;
    private String pw;
    private String name;
    private String email;

    // 2. 기본 생성자 (파라미터 없는 것 - 필수!)
    public MemberDTO() {}

    // 3. 필드 생성자 (회원가입 시 한꺼번에 담기용)
    public MemberDTO(String id, String pw, String name, String email) {
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.email = email;
    }

    // 4. Getter/Setter (이 이름이 정확해야 DAO에서 에러 안 남)
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getPw() { return pw; }
    public void setPw(String pw) { this.pw = pw; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}