(()=> {
    var client = new Api.HelloWorldApi()

    client.apiClient.basePath = "" // no base path, since we are doing same origin communication

    window.app = {
        hello: (name) =>
            client.hello((name || "World"), (err, val)=>
                err ? alert("Error! - " + err.message || err)
                    : document.querySelector("h1").textContent = val + "!")
    }
})()