import React from 'react';
import styles from '../Styles/CohortDetails.module.css';

function CohortDetails(props) {

    return (

        <div className={styles.box}>

            <h3
                style={{
                    color:
                        props.status.toLowerCase() === "ongoing"
                            ? "green"
                            : "blue"
                }}
            >
                {props.title}
            </h3>

            <dl>

                <dt>Trainer</dt>
                <dd>{props.trainer}</dd>

                <dt>Status</dt>
                <dd>{props.status}</dd>

                <dt>Duration</dt>
                <dd>{props.duration}</dd>

            </dl>

        </div>

    );

}

export default CohortDetails;