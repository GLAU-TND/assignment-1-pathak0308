 public class Person {
        private String firstname = "";
        private String lastname = "";
        private String[] contactno;
        private String email = "";

     public Person(String firstname, String lastname, String[] contactno, String email) {
         this.firstname = firstname;
         this.lastname = lastname;
         this.contactno = contactno;
         this.email = email;
     }
     public String getFirstname() {
         return firstname;
     }

     public void setFirstname(String firstname) {
         this.firstname = firstname;
     }

     public String getLastname() {
         return lastname;
     }

     public void setLastname(String lastname) {
         this.lastname = lastname;
     }

     public String[] getContactno() {
         return contactno;
     }

     public void setContactno(String[] contactno) {
         this.contactno = contactno;
     }

     public String getEmail() {
         return email;
     }

     public void setEmail(String email) {
         this.email = email;
     }

     public String toString() {
         final StringBuffer sb = new StringBuffer("-------- * -------- * -------- * --------\n");
         sb.append("firstName=").append(firstname).append('\n');
         sb.append("lastName=").append(lastname).append('\n');
         sb.append("contactno=").append(contactno);

         for (int i = 0; i < contactno.length; i++) {
             sb.append((contactno[i] != null && i != contactno.length ? contactno[i] : ""));

         }
         sb.append("\nemail='").append(email).append('\n');
         sb.append("-------- * -------- * -------- * --------");
         return sb.toString();
     }
 }


}
