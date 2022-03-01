package micronaut.easy.af.controller

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller
class UserController {

    @Get("/index")
    HttpResponse<?> index() {
        return HttpResponse.ok(["returnMessage": "YES", "ts": new Date()])
    }
}
