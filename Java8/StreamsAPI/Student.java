package Java8.StreamsAPI;

/**
 * The Class Student.
 */
public class Student {

    /** The id. */
    private int id;
    
    /** The first name. */
    private String firstName;
    
    /** The last name. */
    private String lastName;
    
    /** The age. */
    private int age;
    
    /** The gender. */
    private String gender;
    
    /** The departmant name. */
    private String departmantName;
    
    /** The joined year. */
    private int joinedYear;
    
    /** The city. */
    private String city;
    
    /** The rank. */
    private int rank;
   
    /**
     * Instantiates a new employee.
     *
     * @param id the id
     * @param firstName the first name
     * @param lastName the last name
     * @param age the age
     * @param gender the gender
     * @param departmantName the departmant name
     * @param joinedYear the joined year
     * @param city the city
     * @param rank the rank
     */
    public Student(int id, String firstName, String lastName, int age, String gender, String departmantName,
      int joinedYear, String city, int rank) {
     super();
     this.id = id;
     this.firstName = firstName;
     this.lastName = lastName;
     this.age = age;
     this.gender = gender;
     this.departmantName = departmantName;
     this.joinedYear = joinedYear;
     this.city = city;
     this.rank = rank;
    }
   
    /**
     * Gets the id.
     *
     * @return the id
     */
    public int getId() {
     return id;
    }
   
    /**
     * Sets the id.
     *
     * @param id the new id
     */
    public void setId(int id) {
     this.id = id;
    }
   
    /**
     * Gets the first name.
     *
     * @return the first name
     */
    public String getFirstName() {
     return firstName;
    }
   
    /**
     * Sets the first name.
     *
     * @param firstName the new first name
     */
    public void setFirstName(String firstName) {
     this.firstName = firstName;
    }
   
    /**
     * Gets the last name.
     *
     * @return the last name
     */
    public String getLastName() {
     return lastName;
    }
   
    /**
     * Sets the last name.
     *
     * @param lastName the new last name
     */
    public void setLastName(String lastName) {
     this.lastName = lastName;
    }
   
    /**
     * Gets the age.
     *
     * @return the age
     */
    public int getAge() {
     return age;
    }
   
    /**
     * Sets the age.
     *
     * @param age the new age
     */
    public void setAge(int age) {
     this.age = age;
    }
   
    /**
     * Gets the gender.
     *
     * @return the gender
     */
    public String getGender() {
     return gender;
    }
   
    /**
     * Sets the gender.
     *
     * @param gender the new gender
     */
    public void setGender(String gender) {
     this.gender = gender;
    }
   
    /**
     * Gets the departmant name.
     *
     * @return the departmant name
     */
    public String getDepartmantName() {
     return departmantName;
    }
   
    /**
     * Sets the departmant name.
     *
     * @param departmantName the new departmant name
     */
    public void setDepartmantName(String departmantName) {
     this.departmantName = departmantName;
    }
   
    /**
     * Gets the joined year.
     *
     * @return the joined year
     */
    public int getJoinedYear() {
     return joinedYear;
    }
   
    /**
     * Sets the joined year.
     *
     * @param joinedYear the new joined year
     */
    public void setJoinedYear(int joinedYear) {
     this.joinedYear = joinedYear;
    }
   
    /**
     * Gets the city.
     *
     * @return the city
     */
    public String getCity() {
     return city;
    }
   
    /**
     * Sets the city.
     *
     * @param city the new city
     */
    public void setCity(String city) {
     this.city = city;
    }
   
    /**
     * Gets the rank.
     *
     * @return the rank
     */
    public int getRank() {
     return rank;
    }
   
    /**
     * Sets the rank.
     *
     * @param rank the new rank
     */
    public void setRank(int rank) {
     this.rank = rank;
    }
   
    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString() {
     return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
       + ", gender=" + gender + ", departmantName=" + departmantName + ", joinedYear=" + joinedYear + ", city="
       + city + ", rank=" + rank + "]";
    }
   
   }