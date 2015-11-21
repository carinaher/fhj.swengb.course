package fhj.swengb

import java.net.URL

import spray.json._

/**
  * Created by lad on 13.11.15.
  */
object GitHub {

  case class User(login: String, avatarUrl: URL, htmlUrl: URL, company: String)

  object GithubUserProtocol extends DefaultJsonProtocol {

    implicit object GithubUserJsonFormat extends RootJsonFormat[User] {
      def write(user: User): JsValue =
        JsArray(
          JsString(user.login),
          JsString(user.avatarUrl.toString),
          JsString(user.htmlUrl.toString),
          JsString(user.company.toString)
        )


      def read(value: JsValue): User = {
          value match {
            case JsObject(m) =>
              val JsString(login) = m("login")
              val JsString(a_url) = m("avatar_url")
              val JsString(html_url) = m("html_url")
              val JsString(company) = m("company")
              User(login, new URL(a_url), new URL(html_url), company)
            case x =>
              deserializationError("GitHubUser expected.")
          }
      }

    }

  }

}
