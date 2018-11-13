<g:select name="publisher.id" required="" id="publisher" from="${app.admin.jobsboard.Publisher.list()}"
    optionKey="id"
    optionValue="name"
    value="${bean?.publisher*.id}"

/>