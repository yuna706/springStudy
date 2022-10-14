$(() => {
    getList(createList);

    $("#closeBtn").on("click", () => {
        $(".popup, .background-black").hide();
    })
});

const createList = (result) => {
    $("tbody tr").html("");

    let box;
    result.forEach(item => {
        box = `<td>
                <p>${item.content}</p>
                <div>
                    <div class="${item.enNm}">${item.krNm}</div>
                    <div>${item.insertDt}</div>
                </div>
            </td>`;

        $(`tbody [data-kind=${item.enNm}]`).append(box);
        $(`tbody [data-kind=${item.enNm}] td:last-child`).data(item);
    });

    // 해당 노드가 생성된 후 이벤트 리스터를 생성해야 동작함
    $("tbody tr td").on("click", (e) => {
        const data = $(e.currentTarget).data();
        $(".popup textarea").val(data.content);
        $(`.popup input#${data.enNm}`).attr("checked", true);
        $(".popup, .background-black").show();
    });
}

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