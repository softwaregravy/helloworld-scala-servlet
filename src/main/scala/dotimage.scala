import javax.servlet.http._

class DotImage extends HttpServlet {
  override def doGet(req: HttpServletRequest, resp: HttpServletResponse) =
    resp.getWriter().print("Hello World!")
}
