/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.getstarted.basicactions;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import org.apache.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@WebServlet(value = "/")
public class HelloworldController extends HttpServlet {
//static Logger log = Logger.getLogger(HelloworldController.class.getName());


  @Override
  public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

    Logger logger = LogManager.getRootLogger();
    logger.trace("Configuration File Defined To Be :: "+System.getProperty("log4j.configurationFile"));
    logger.info("Calling Method Run_10K");
    logger.info("Calling Method Run_20K");
    //   logger.printf("Integer.MAX_VALUE = %,d", Integer.MAX_VALUE);
    logger.debug("Long.MAX_VALUE = %,d", Long.MAX_VALUE);
    logger.trace("Entering method processOrder().");
    logger.debug("Received order with ID 12345.");
    logger.info("Order shipped successfully.");
    logger.warn("Potential security vulnerability detected in user input: '...'");
    logger.error("Failed to process order. Error: {. . .}");
    logger.fatal("System crashed. Shutting down...");

    resp.getWriter().write("Hello world - GCE i am in again! new version");
    resp.setStatus(HttpServletResponse.SC_OK);


  }
}
