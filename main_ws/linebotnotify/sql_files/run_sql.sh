#!/usr/bin/sh

run_sql() {
    filename=$1
    sqlplus /nolog << EOF
        @${filename}
        exit;
    EOF
}

run_sql $1