<g:select name="type.id" required="" id="tags" from="${app.admin.jobsboard.Type.list()}"
    optionKey="id"
    optionValue="name"
    value="${bean?.type*.id}"
    multiple="true"
/>