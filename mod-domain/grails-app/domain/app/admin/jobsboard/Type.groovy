package app.admin.jobsboard

class Type {
    String name
    String description

    Date dateCreated
    Date lastUpdated

    static constraints = {
        name nullable: false, blank: false
        description nullable: true, blank: true
    }

    @Override
    String toString() {
        return name
    }

    static mapping = {
        cache true
    }
}
