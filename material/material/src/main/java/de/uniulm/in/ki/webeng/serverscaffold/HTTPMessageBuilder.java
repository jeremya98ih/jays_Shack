package de.uniulm.in.ki.webeng.serverscaffold;

import de.uniulm.in.ki.webeng.serverscaffold.model.Request;

/**
 * Assembles a request byte by byte
 *
 * Created by Markus Brenner on 07.09.2016.
 */
public class HTTPMessageBuilder {
    /**
     * Appends a character to the current request.
     *
     * @param c
     *            The next character
     * @return True, if the addition of the provided byte has completed the
     *         request
     */
    public boolean append(byte c) {
        // TODO: implement
        return true;
    }

    /**
     * Obtains the assembled request
     * 
     * @return The assembled request or null, if the request has not been
     *         completed yet
     */
    public Request getRequest() {
        // TODO: implement
        return null;
    }
}
