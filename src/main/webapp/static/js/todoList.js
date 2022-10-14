const getList = (callbackFN) => {
    //체크된 input list
    const kind = $("input[name=searchKind]:checked");
    let kindSeqList = new Array();
    kind.each(item => {
        kindSeqList.push(item);
    })

    const param = {
        kindSeqList: kindSeqList,
    }

    $.ajax({
        url: "/todoList",
        type: "POST",
        data: JSON.stringify(param),
        contentType: "application/json; charset=utf-8",
    }).done((result) => {
        // callback function
        callbackFN(result);
    }).fail((result) => {
        alert(result);
    });
}

const get = (seq, callbackFN) => {
    $.ajax({
        url: `/todoList/${seq}`,
        type: "GET",
        contentType: "application/json; charset=utf-8",
    }).done((result) => {
        // callback function
        callbackFN(result);
    }).fail((result) => {
        alert(result);
    });
}

const add = (callbackFN) => {
    //체크된 input list
    const kindSeq = $("input[name=kind]").val();
    const content = $("textarea#content").val();

    const param = {
        kindSeq: kindSeq,
        content: content
    }

    $.ajax({
        url: "/todoList",
        type: "PUT",
        data: JSON.stringify(param),
        contentType: "application/json; charset=utf-8",
    }).done((result) => {
        // callback function
        callbackFN(result);
    }).fail((result) => {
        alert(result);
    });
}

const mod = (boardSeq, callbackFN) => {
    //체크된 input list
    const kindSeq = $("input[name=kind]").val();
    const content = $("textarea#content").val();

    const param = {
        kindSeq: kindSeq,
        content: content
    }

    $.ajax({
        url: "/todoList/${boardSeq}",
        type: "PATCH",
        data: JSON.stringify(param),
        contentType: "application/json; charset=utf-8",
    }).done((result) => {
        // callback function
        callbackFN(result);
    }).fail((result) => {
        alert(result);
    });
}


const del = (seq, callbackFN) => {
    $.ajax({
        url: `/todoList/${seq}`,
        type: "DELETE",
        contentType: "application/json; charset=utf-8",
    }).done((result) => {
        // callback function
        callbackFN(result);
    }).fail((result) => {
        alert(result);
    });
}