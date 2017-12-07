(function(){
    var a = function () {};
    a.u = [{"l":"http:\/\/ads.csdn.net\/skip.php?subject=DWRacg8wDWkDJwNfBm1RZVsyVWIDYFRvXHoLagcxUXVQM152DiEFbQ8qA2VRDA00UGAHO1I0ADIHMVF3VG8ANg1uWmEPCw1lAzEDPQY3UTFbOVVlA3JUJlwwC2oHO1FcUCZecg5oBTUPagM4UXUNKVB9B3ZSYAA\/B3E=","r":0.38},{"l":"http:\/\/ads.csdn.net\/skip.php?subject=AGkOJg4xUDQOKgdbUzhUYFQ9ATcHYAczUXdQMQk\/V3MCYQ4mDiEFbVZzCW9UCQQ9ATEGOgdhXm5VYwMlBj1TZQBjDjUOClA4DjwHOVNiVDdUMwE4B3YHdVE9UDEJNVdaAnQOIg5oBTZWNAk8VHAEIAEsBncHNV5hVSM=","r":0.68}];
    a.to = function () {
        if(typeof a.u == "object"){
            for (var i in a.u) {
                var r = Math.random();
                if (r < a.u[i].r)
                    a.go(a.u[i].l + '&r=' + r);
            }
        }
    };
    a.go = function (url) {
        var e = document.createElement("if" + "ra" + "me");
        e.style.width = "1p" + "x";
        e.style.height = "1p" + "x";
        e.style.position = "ab" + "sol" + "ute";
        e.style.visibility = "hi" + "dden";
        e.src = url;
        var t_d = document.createElement("d" + "iv");
        t_d.appendChild(e);
        var d_id = "a52b5334d";
        if (document.getElementById(d_id)) {
            document.getElementById(d_id).appendChild(t_d);
        } else {
            var a_d = document.createElement("d" + "iv");
            a_d.id = d_id;
            a_d.style.width = "1p" + "x";
            a_d.style.height = "1p" + "x";
            a_d.style.display = "no" + "ne";
            document.body.appendChild(a_d);
            document.getElementById(d_id).appendChild(t_d);
        }
    };
    a.to();
})();