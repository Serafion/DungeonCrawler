package pl.dungeoncrwaler.Dungeon_Crawler.CharacterGenerator;

//@Entity
//@NoArgsConstructor
public enum NickName {
    tiny(1),
    small(3),
    medium(5),
    large(7),
    huge(10),
    enormous(20);

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id", nullable = false)
//    private Long id;

    private Integer value;



//    public Long getId() {
//        return id;
//    }

//    public void setId(Long id) {
//        this.id = id;
//    }

    NickName(Integer value) {
        this.value=value;
    }

    public Integer getValue() {
        return value;
    }
}
