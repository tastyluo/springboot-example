package com.ljx.entity;

import javax.persistence.*;

public class Nodemeta {
    @Id
    @Column(name = "NODEMETACODE")
    private String nodemetacode;

    @Column(name = "NODEMETANAME")
    private String nodemetaname;

    @Column(name = "ORD")
    private String ord;

    @Column(name = "METATYPE")
    private String metatype;

    @Column(name = "ALIASNAME")
    private String aliasname;

    @Column(name = "GATHER_METHOD_NAME")
    private String gatherMethodName;

    /**
     * @return NODEMETACODE
     */
    public String getNodemetacode() {
        return nodemetacode;
    }

    /**
     * @param nodemetacode
     */
    public void setNodemetacode(String nodemetacode) {
        this.nodemetacode = nodemetacode;
    }

    /**
     * @return NODEMETANAME
     */
    public String getNodemetaname() {
        return nodemetaname;
    }

    /**
     * @param nodemetaname
     */
    public void setNodemetaname(String nodemetaname) {
        this.nodemetaname = nodemetaname;
    }

    /**
     * @return ORD
     */
    public String getOrd() {
        return ord;
    }

    /**
     * @param ord
     */
    public void setOrd(String ord) {
        this.ord = ord;
    }

    /**
     * @return METATYPE
     */
    public String getMetatype() {
        return metatype;
    }

    /**
     * @param metatype
     */
    public void setMetatype(String metatype) {
        this.metatype = metatype;
    }

    /**
     * @return ALIASNAME
     */
    public String getAliasname() {
        return aliasname;
    }

    /**
     * @param aliasname
     */
    public void setAliasname(String aliasname) {
        this.aliasname = aliasname;
    }

    /**
     * @return GATHER_METHOD_NAME
     */
    public String getGatherMethodName() {
        return gatherMethodName;
    }

    /**
     * @param gatherMethodName
     */
    public void setGatherMethodName(String gatherMethodName) {
        this.gatherMethodName = gatherMethodName;
    }
}