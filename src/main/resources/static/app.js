window.app = {
    hello: (name) =>
        fetch("/hello/"+encodeURIComponent(name || "World"))
            .then(res => res.text())
            .then(val => document.querySelector("h1").textContent = val + "!")
            .catch(err => alert("Error! - " + err.message || err))
}
