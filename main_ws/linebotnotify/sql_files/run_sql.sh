#!/usr/bin/sh

run_sql() {
    filename=$1
    sqlplus /nolog @$filename
}

run_sql $1
