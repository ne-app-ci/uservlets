// SPDX-License-Identifier: Apache-2.0
// Copyright 2026, Ne.app.
// Official repository: https://github.com/ne-app-ci/servino

package com.ne_app.servino;

import com.ne_app.servino.servlet.IServlet;

/// @brief A servlet worker interface to run and stop servlets
public interface IServletWorker {
    public IServlet startServlet();
    public void stopServlet(IServlet servlet);
}
