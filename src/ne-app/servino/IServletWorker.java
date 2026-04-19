/**
 * Copyright - Ne.app
 */

package system;

/// @brief A servlet worker interface to run and stop servlets
public interface IServletWorker {
    public IServlet startServlet();
    public void stopServlet(IServlet servlet);
}
