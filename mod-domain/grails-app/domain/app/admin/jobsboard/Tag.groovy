package app.admin.jobsboard

class Tag {
    String name

    Date dateCreated
    Date lastUpdated

    static constraints = {
        name nullable: false, blank: false
    }

    @Override
    String toString() {
        return name
    }

    static mapping = {
        cache true
    }
}
