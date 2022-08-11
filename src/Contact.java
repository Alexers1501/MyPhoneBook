public class Contact {

    protected String name;
    protected String phone;   //id, всегда уникальный

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (this.name != null ? name.hashCode() : 0);
        result = 31 * result + (this.phone != null ? phone.hashCode() : 0);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Contact c = (Contact) obj;
        return this.name.equals(c.name)
                && this.phone.equals(c.phone);
    }

    @Override
    public String toString() {
        return this.name + "\t тел: " + this.phone;
    }
}
