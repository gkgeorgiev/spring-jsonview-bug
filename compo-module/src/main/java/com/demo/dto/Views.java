

package com.demo.dto;

/**
 * These classes are used as {@link com.fasterxml.jackson.annotation.JsonView}, to prevent recursive serialization and
 * better control of the JSON output in the different cases.
 */
public class Views {
    /**
     * This view should be annotated only for the non-recursive attributes.
     */
    public static class Basic{}

    /**
     * This view will render all the attributes + the list of associated Functional Areas.
     */
    public static class Component extends Basic{}

    /**
     * This view will render all the attributes + the list of associated Components and UserGroups.
     */
    public static class FunctionalArea extends Basic{}

}
