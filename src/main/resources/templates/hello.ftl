<#assign
    isNameSetted = username??
>

<html>
<body>
Hello, ${name}
<div style="margin-top: 10px">
    <form method="post">
        <input type="text" name="name" placeholder="Your name"/>
        <button type="submit">Save</button>
    </form>
</div>
<div style="margin-top: 10px">
    <form action="/logout" method="post">
        <button type="submit">Exit</button>
    </form>
</div>
</body>
</html>